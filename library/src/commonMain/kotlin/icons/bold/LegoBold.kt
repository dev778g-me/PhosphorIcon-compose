package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.LegoBold: ImageVector
    get() {
        if (_LegoBold != null) {
            return _LegoBold!!
        }
        _LegoBold = ImageVector.Builder(
            name = "Bold.LegoBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 168f)
                lineTo(80f, 224f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 100f)
                arcToRelative(32f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                arcToRelative(32f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 60f)
                arcToRelative(32f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                arcToRelative(32f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 136f)
                lineToRelative(64f, 32f)
                lineToRelative(160f, -80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(240f, 88f)
                lineToRelative(0f, 56f)
                lineToRelative(-160f, 80f)
                lineToRelative(-64f, -32f)
                lineToRelative(0f, -56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(58.44f, 114.78f)
                lineTo(16f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(138.44f, 74.78f)
                lineTo(107.81f, 90.1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(240f, 88f)
                lineTo(191.45f, 63.72f)
            }
        }.build()

        return _LegoBold!!
    }

@Suppress("ObjectPropertyName")
private var _LegoBold: ImageVector? = null
