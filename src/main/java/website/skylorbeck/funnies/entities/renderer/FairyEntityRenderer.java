package website.skylorbeck.funnies.entities.renderer;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import website.skylorbeck.funnies.Declarar;
import website.skylorbeck.funnies.entities.FairyEntity;
import website.skylorbeck.funnies.entities.models.FairyModelGeo;

public class FairyEntityRenderer extends GeoEntityRenderer<FairyEntity> {
    public FairyEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new FairyModelGeo());
    }

    @Override
    public RenderLayer getRenderType(FairyEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(this.getTextureLocation(animatable));
    }
}
