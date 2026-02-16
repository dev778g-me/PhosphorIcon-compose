package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.OrangeSliceBold: ImageVector
    get() {
        if (_OrangeSliceBold != null) {
            return _OrangeSliceBold!!
        }
        _OrangeSliceBold = ImageVector.Builder(
            name = "Bold.OrangeSliceBold",
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
                moveTo(12f, 88f)
                horizontalLineTo(244f)
                verticalLineToRelative(4f)
                arcTo(116f, 116f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 92f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(52f, 88f)
                verticalLineToRelative(4f)
                arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 0f)
                verticalLineTo(88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 88f)
                lineTo(88.28f, 156.8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 88f)
                lineTo(167.72f, 156.8f)
            }
        }.build()

        return _OrangeSliceBold!!
    }

@Suppress("ObjectPropertyName")
private var _OrangeSliceBold: ImageVector? = null
