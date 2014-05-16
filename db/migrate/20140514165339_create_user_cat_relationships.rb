class CreateUserCatRelationships < ActiveRecord::Migration
  def change
    create_table :user_cat_relationships do |t|
      t.integer :user_id
      t.integer :category_id

      t.timestamps
    end

    add_index :user_cat_relationships, :user_id
    add_index :user_cat_relationships, :category_id
    add_index :user_cat_relationships, [:user_id, :category_id], unique: true
  end
end
