package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FileTxtFill: ImageVector
    get() {
        if (_FileTxtFill != null) {
            return _FileTxtFill!!
        }
        _FileTxtFill = ImageVector.Builder(
            name = "Filled.FileTxtFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(154.31f, 156.92f)
                lineTo(137.83f, 180f)
                lineToRelative(16.53f, 23.14f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.22f, 11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.65f, -1.48f)
                lineTo(128f, 193.76f)
                lineToRelative(-13.49f, 18.89f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.64f, 1.49f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.23f, -11f)
                lineTo(118.17f, 180f)
                lineToRelative(-16.48f, -23.08f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, -11.28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.36f, 1.71f)
                lineTo(128f, 166.24f)
                lineToRelative(13.49f, -18.89f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.36f, -1.71f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 154.31f, 156.92f)
                close()
                moveTo(84f, 144f)
                lineTo(44.27f, 144f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 151.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44f, 160f)
                lineTo(56f, 160f)
                verticalLineToRelative(47.73f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 63.47f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 208f)
                lineTo(72f, 160f)
                lineTo(83.73f, 160f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 152.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 144f)
                close()
                moveTo(212f, 144f)
                lineTo(172.27f, 144f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.25f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8.53f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(47.73f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, -8f)
                lineTo(200.02f, 160f)
                horizontalLineToRelative(11.73f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.25f, -7.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212f, 144f)
                close()
                moveTo(40f, 116f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 2.34f)
                lineToRelative(56f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 88f)
                verticalLineToRelative(28f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(44f, 120f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 116f)
                close()
                moveTo(152f, 88f)
                horizontalLineToRelative(44f)
                lineTo(152f, 44f)
                close()
            }
        }.build()

        return _FileTxtFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileTxtFill: ImageVector? = null
