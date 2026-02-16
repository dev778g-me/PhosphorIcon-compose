package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.FarmLight: ImageVector
    get() {
        if (_FarmLight != null) {
            return _FarmLight!!
        }
        _FarmLight = ImageVector.Builder(
            name = "Light.FarmLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 142f)
                arcToRelative(255f, 255f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, -22f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(164.89f, 162.23f)
                arcTo(223.75f, 223.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(196.89f, 187.2f)
                arcTo(193.47f, 193.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 184f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 184f)
                arcToRelative(191.09f, 191.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 106.17f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 152f)
                arcToRelative(223.28f, 223.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156.77f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 120f)
                arcToRelative(255.5f, 255.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 199.85f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 126.14f)
                lineToRelative(0f, -46.14f)
                lineToRelative(64f, -48f)
                lineToRelative(64f, 48f)
                lineToRelative(0f, 41.11f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 138.61f)
                lineToRelative(0f, -42.61f)
                lineToRelative(48f, 0f)
                lineToRelative(0f, 32.06f)
            }
        }.build()

        return _FarmLight!!
    }

@Suppress("ObjectPropertyName")
private var _FarmLight: ImageVector? = null
