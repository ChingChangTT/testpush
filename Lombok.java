package Review;


import lombok.Data;

@Data
 class TestThisSuper {
    private Integer id;
    private String name;
    public static void main(String[] args) {
        TestThisSuper obj = new TestThisSuper();
        obj.setId(12);
        obj.setName("Name");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}

