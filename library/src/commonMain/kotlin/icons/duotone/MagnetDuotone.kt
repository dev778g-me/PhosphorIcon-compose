package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.MagnetDuotone: ImageVector
    get() {
        if (_MagnetDuotone != null) {
            return _MagnetDuotone!!
        }
        _MagnetDuotone = ImageVector.Builder(
            name = "Duotone.MagnetDuotone",
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
                moveTo(128.57f, 160.57f)
                lineToRelative(-30f, 29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, 11.4f)
                lineToRelative(28.66f, 28.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.26f, 0.05f)
                lineToRelative(30f, -29.35f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(55.77f, 87.77f)
                lineTo(26.31f, 117.6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.28f)
                lineTo(55f, 157.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.38f, -0.06f)
                lineToRelative(29.18f, -29.92f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(26.34f, 128.88f)
                lineTo(55f, 157.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.37f, -0.06f)
                lineTo(127.29f, 95f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.61f, -0.33f)
                curveToRelative(9.69f, 9.34f, 9.46f, 25.14f, -0.05f, 34.65f)
                lineTo(98.54f, 189.6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, 11.4f)
                lineToRelative(28.66f, 28.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.26f, 0.05f)
                lineToRelative(61.74f, -60.43f)
                curveToRelative(31.19f, -31.19f, 32.1f, -82f, 1.14f, -113.42f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -113.57f, -0.43f)
                lineTo(26.31f, 117.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 26.34f, 128.88f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128.57f, 160.57f)
                lineTo(168.36f, 200.36f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(55.77f, 87.77f)
                lineTo(95.56f, 127.56f)
            }
        }.build()

        return _MagnetDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MagnetDuotone: ImageVector? = null
