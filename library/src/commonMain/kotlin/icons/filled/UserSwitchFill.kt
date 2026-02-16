package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.UserSwitchFill: ImageVector
    get() {
        if (_UserSwitchFill != null) {
            return _UserSwitchFill!!
        }
        _UserSwitchFill = ImageVector.Builder(
            name = "Filled.UserSwitchFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(84f, 120f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 44f, 44f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 120f)
                close()
                moveTo(210.16f, 177.18f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.86f, 2.41f)
                arcToRelative(87.42f, 87.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.52f, 6.85f)
                arcTo(79.76f, 79.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 172f, 165.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.84f, 0.32f)
                arcToRelative(59.8f, 59.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -78.26f, 0f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 165.1f)
                arcToRelative(79.71f, 79.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.79f, 21.31f)
                arcTo(87.66f, 87.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.37f, 136f)
                horizontalLineToRelative(15.4f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.69f, -3.28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -10.38f)
                lineToRelative(-24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineToRelative(-24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 10.38f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.23f, 136f)
                lineTo(24.3f, 136f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 188.18f, 52.67f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 210.16f, 177.18f)
                close()
                moveTo(255.39f, 124.94f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 120f)
                lineTo(231.7f, 120f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 43.52f, 67.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9.34f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215.63f, 120f)
                lineTo(200f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                lineToRelative(24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 0f)
                lineToRelative(24f, -24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 255.39f, 124.94f)
                close()
            }
        }.build()

        return _UserSwitchFill!!
    }

@Suppress("ObjectPropertyName")
private var _UserSwitchFill: ImageVector? = null
