package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UserCircleMinusFill: ImageVector
    get() {
        if (_UserCircleMinusFill != null) {
            return _UserCircleMinusFill!!
        }
        _UserCircleMinusFill = ImageVector.Builder(
            name = "Filled.UserCircleMinusFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 76f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44f, 44f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 76f)
                close()
                moveTo(176f, 64f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(176f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
                moveTo(215.87f, 88.46f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 211f, 98.67f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17.23f, 87.74f)
                arcTo(79.86f, 79.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 172f, 165.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.84f, 0.32f)
                arcToRelative(59.81f, 59.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -78.27f, 0f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 165.1f)
                arcToRelative(79.71f, 79.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.79f, 21.31f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 40f)
                arcToRelative(88.76f, 88.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.68f, 1.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.64f, -15.78f)
                arcToRelative(103.9f, 103.9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 80.76f, 67.89f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.87f, 88.46f)
                close()
            }
        }.build()

        return _UserCircleMinusFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserCircleMinusFill: ImageVector? = null
