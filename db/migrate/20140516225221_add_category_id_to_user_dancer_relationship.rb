class AddCategoryIdToUserDancerRelationship < ActiveRecord::Migration
  def change
    add_column :user_dancer_relationships, :category_id, :integer

    add_index :user_dancer_relationships, [:category_id]
    add_index :user_dancer_relationships, [:dancer_id, :category_id], unique: true
  end
end
