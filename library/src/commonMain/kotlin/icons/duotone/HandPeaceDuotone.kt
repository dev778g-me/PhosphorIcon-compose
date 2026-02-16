package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.HandPeaceDuotone: ImageVector
    get() {
        if (_HandPeaceDuotone != null) {
            return _HandPeaceDuotone!!
        }
        _HandPeaceDuotone = ImageVector.Builder(
            name = "Duotone.HandPeaceDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(207.31f, 49.18f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -38.63f, -10.35f)
                lineToRelative(-18.14f, 67.68f)
                horizontalLineToRelative(0f)
                lineToRelative(-5.37f, -1.07f)
                horizontalLineToRelative(0f)
                lineTo(127.32f, 38.83f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 88.69f, 49.18f)
                lineToRelative(12.68f, 47.35f)
                verticalLineToRelative(0f)
                lineToRelative(-0.57f, -0.14f)
                lineTo(80f, 92.41f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 39.19f)
                lineToRelative(7.87f, 1.51f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.46f, 15.62f)
                arcToRelative(19.52f, 19.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.41f, 4f)
                horizontalLineToRelative(0f)
                verticalLineTo(160f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72.55f, 72f)
                curveToRelative(39.7f, -0.3f, 71.45f, -33.2f, 71.45f, -72.9f)
                verticalLineToRelative(-3.34f)
                arcToRelative(47.9f, 47.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.59f, -32.39f)
                horizontalLineToRelative(0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 131.6f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -39.19f)
                lineToRelative(20.81f, 4f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 39.19f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 152.72f)
                verticalLineTo(160f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72.55f, 72f)
                curveToRelative(39.7f, -0.3f, 71.45f, -33.2f, 71.45f, -72.9f)
                verticalLineToRelative(-3.34f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -38.59f, -47.07f)
                lineTo(140f, 104.41f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 39.19f)
                lineToRelative(15.37f, 3.07f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 179.6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 172.32f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -39.19f)
                lineToRelative(10f, 2f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 39.2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(101.37f, 96.53f)
                lineTo(88.69f, 49.18f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 38.63f, -10.35f)
                lineToRelative(17.85f, 66.61f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(150.54f, 106.51f)
                lineToRelative(18.14f, -67.68f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.63f, 10.35f)
                lineToRelative(-19.88f, 74.19f)
            }
        }.build()

        return _HandPeaceDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HandPeaceDuotone: ImageVector? = null
