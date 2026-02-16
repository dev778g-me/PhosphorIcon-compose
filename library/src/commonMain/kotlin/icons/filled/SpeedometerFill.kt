package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SpeedometerFill: ImageVector
    get() {
        if (_SpeedometerFill != null) {
            return _SpeedometerFill!!
        }
        _SpeedometerFill = ImageVector.Builder(
            name = "Filled.SpeedometerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.87f, 90.86f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.17f, -0.62f)
                lineToRelative(-75.42f, 75.42f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 129f, 154.35f)
                lineToRelative(92.7f, -92.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(197f, 63.73f)
                arcTo(112.05f, 112.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.34f, 189.25f)
                arcTo(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 37.46f, 200f)
                horizontalLineTo(218.53f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.11f, -10.71f)
                arcToRelative(112.28f, 112.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.77f, -98.43f)
                close()
                moveTo(57.44f, 166.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.25f, 9.43f)
                arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 0.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.83f, -6.41f)
                arcTo(88.06f, 88.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 143.59f, 65.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, 15.75f)
                arcToRelative(72.07f, 72.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -83.33f, 85.28f)
                close()
            }
        }.build()

        return _SpeedometerFill!!
    }

@Suppress("ObjectPropertyName")
private var _SpeedometerFill: ImageVector? = null
