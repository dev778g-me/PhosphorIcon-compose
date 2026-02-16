package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.PipeWrenchLight: ImageVector
    get() {
        if (_PipeWrenchLight != null) {
            return _PipeWrenchLight!!
        }
        _PipeWrenchLight = ImageVector.Builder(
            name = "Light.PipeWrenchLight",
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
                moveTo(125.66f, 145.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.32f)
                lineTo(77f, 85f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -24f)
                horizontalLineToRelative(0f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 0f)
                lineToRelative(72.69f, 73.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                lineTo(85f, 235f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(132.28f, 92.58f)
                lineTo(150.9f, 74.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.25f, -0.06f)
                lineToRelative(37.45f, 35.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, 0f)
                lineToRelative(3.72f, -3.72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -45.25f)
                lineToRelative(-45f, -42.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineTo(108.12f, 68.19f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(84f, 92.12f)
                lineTo(58.34f, 117.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.31f)
                lineTo(71f, 141.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, 0f)
                lineTo(108f, 116.4f)
            }
        }.build()

        return _PipeWrenchLight!!
    }

@Suppress("ObjectPropertyName")
private var _PipeWrenchLight: ImageVector? = null
