package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NumberTwoFill: ImageVector
    get() {
        if (_NumberTwoFill != null) {
            return _NumberTwoFill!!
        }
        _NumberTwoFill = ImageVector.Builder(
            name = "Filled.NumberTwoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                horizontalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(160f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.79f, -13.52f)
                lineTo(145.9f, 120f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -35.73f, -32f)
                arcTo(23.33f, 23.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 107f, 92.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14f, -7.77f)
                arcToRelative(40.22f, 40.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.28f, -7.38f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 59.45f, 53.54f)
                lineToRelative(-0.16f, 0.16f)
                lineTo(114.66f, 176f)
                close()
            }
        }.build()

        return _NumberTwoFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberTwoFill: ImageVector? = null
