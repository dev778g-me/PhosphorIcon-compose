package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NumberCircleTwoFill: ImageVector
    get() {
        if (_NumberCircleTwoFill != null) {
            return _NumberCircleTwoFill!!
        }
        _NumberCircleTwoFill = ImageVector.Builder(
            name = "Filled.NumberCircleTwoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(152f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(104f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.4f, -12.8f)
                lineToRelative(43.17f, -57.56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, -27.86f, -15f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.09f, -5.34f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 55.74f, 29.93f)
                lineTo(120f, 168f)
                close()
            }
        }.build()

        return _NumberCircleTwoFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleTwoFill: ImageVector? = null
