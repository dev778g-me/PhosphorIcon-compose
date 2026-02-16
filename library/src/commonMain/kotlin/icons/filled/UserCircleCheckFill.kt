package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UserCircleCheckFill: ImageVector
    get() {
        if (_UserCircleCheckFill != null) {
            return _UserCircleCheckFill!!
        }
        _UserCircleCheckFill = ImageVector.Builder(
            name = "Filled.UserCircleCheckFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230.56f, 110.68f)
                arcToRelative(103.92f, 103.92f, 0f, isMoreThanHalf = true, isPositiveArc = true, -85.24f, -85.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.64f, 15.78f)
                arcTo(88.07f, 88.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 128f)
                arcToRelative(87.62f, 87.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.24f, 58.41f)
                arcTo(79.71f, 79.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 165.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.84f, 0.32f)
                arcToRelative(59.8f, 59.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78.26f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.84f, -0.32f)
                arcToRelative(79.86f, 79.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.79f, 21.31f)
                arcTo(87.62f, 87.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 128f)
                arcToRelative(88.85f, 88.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.22f, -14.68f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.78f, -2.64f)
                close()
                moveTo(84f, 120f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 44f, -44f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 120f)
                close()
                moveTo(237.66f, 34.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineTo(200f, 60.69f)
                lineTo(189.66f, 50.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 11.32f)
                lineToRelative(16f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 0f)
                lineToRelative(32f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 237.66f, 34.34f)
                close()
            }
        }.build()

        return _UserCircleCheckFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserCircleCheckFill: ImageVector? = null
