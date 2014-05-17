class CreateDancers < ActiveRecord::Migration
  def change
    create_table :dancers do |t|
      t.string :name
      t.integer :category_id

      t.timestamps
    end

    add_index :dancers, :category_id
  end
end
