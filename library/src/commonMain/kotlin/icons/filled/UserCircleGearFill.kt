package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UserCircleGearFill: ImageVector
    get() {
        if (_UserCircleGearFill != null) {
            return _UserCircleGearFill!!
        }
        _UserCircleGearFill = ImageVector.Builder(
            name = "Filled.UserCircleGearFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(228.25f, 63.07f)
                lineToRelative(-4.66f, -2.69f)
                arcToRelative(23.6f, 23.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8.76f)
                lineToRelative(4.66f, -2.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -13.86f)
                lineToRelative(-4.67f, 2.7f)
                arcTo(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 33.38f)
                lineTo(208f, 28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(5.38f)
                arcToRelative(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.58f, 4.39f)
                lineToRelative(-4.67f, -2.7f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8f, 13.86f)
                lineToRelative(4.66f, 2.69f)
                arcToRelative(23.6f, 23.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.76f)
                lineToRelative(-4.66f, 2.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 14.93f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -1.07f)
                lineToRelative(4.67f, -2.7f)
                arcTo(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 78.62f)
                lineTo(192f, 84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(208f, 78.62f)
                arcToRelative(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.58f, -4.39f)
                lineToRelative(4.67f, 2.7f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 1.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -14.93f)
                close()
                moveTo(200f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 64f)
                close()
                moveTo(128f, 76f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44f, 44f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 76f)
                close()
                moveTo(230.56f, 110.68f)
                arcToRelative(103.92f, 103.92f, 0f, isMoreThanHalf = true, isPositiveArc = true, -85.24f, -85.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.64f, 15.78f)
                arcTo(88.07f, 88.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 128f)
                arcToRelative(87.62f, 87.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.24f, 58.41f)
                arcTo(79.71f, 79.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 165.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.83f, 0.32f)
                arcToRelative(59.81f, 59.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78.27f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.84f, -0.32f)
                arcToRelative(79.86f, 79.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.79f, 21.31f)
                arcTo(87.62f, 87.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 128f)
                arcToRelative(88.85f, 88.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.22f, -14.68f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.78f, -2.64f)
                close()
            }
        }.build()

        return _UserCircleGearFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserCircleGearFill: ImageVector? = null
