package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.SpiralBold: ImageVector
    get() {
        if (_SpiralBold != null) {
            return _SpiralBold!!
        }
        _SpiralBold = ImageVector.Builder(
            name = "Bold.SpiralBold",
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
                moveTo(124f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                arcToRelative(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, 26f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -36f, 36f)
                arcToRelative(46f, 46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -46f, -46f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -56f)
                arcToRelative(66f, 66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66f, 66f)
                arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -76f, 76f)
                arcToRelative(86f, 86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -86f, -86f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, -96f)
                arcTo(106f, 106f, 0f, isMoreThanHalf = false, isPositiveArc = true, 238f, 138f)
            }
        }.build()

        return _SpiralBold!!
    }

@Suppress("ObjectPropertyName")
private var _SpiralBold: ImageVector? = null
