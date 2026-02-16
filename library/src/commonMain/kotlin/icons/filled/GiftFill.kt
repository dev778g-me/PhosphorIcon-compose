package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GiftFill: ImageVector
    get() {
        if (_GiftFill != null) {
            return _GiftFill!!
        }
        _GiftFill = ImageVector.Builder(
            name = "Filled.GiftFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 72f)
                lineTo(180.92f, 72f)
                curveToRelative(0.39f, -0.33f, 0.79f, -0.65f, 1.17f, -1f)
                arcTo(29.53f, 29.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 49.57f)
                arcTo(32.62f, 32.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 158.44f, 16f)
                arcTo(29.53f, 29.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 137f, 25.91f)
                arcToRelative(54.94f, 54.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 14.48f)
                arcToRelative(54.94f, 54.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -14.48f)
                arcTo(29.53f, 29.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 97.56f, 16f)
                arcTo(32.62f, 32.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 49.57f)
                arcTo(29.53f, 29.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 73.91f, 71f)
                curveToRelative(0.38f, 0.33f, 0.78f, 0.65f, 1.17f, 1f)
                lineTo(40f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 88f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                verticalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(60f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(120f, 120f)
                lineTo(40f, 120f)
                lineTo(40f, 88f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(16f)
                lineTo(136f, 88f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(32f)
                lineTo(136f, 120f)
                verticalLineToRelative(92f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(60f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 136f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 72f)
                close()
                moveTo(84.51f, 59f)
                arcToRelative(13.69f, 13.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, -10f)
                arcTo(16.62f, 16.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96.59f, 32f)
                horizontalLineToRelative(0.49f)
                arcToRelative(13.69f, 13.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4.5f)
                curveToRelative(8.39f, 9.48f, 11.35f, 25.2f, 12.39f, 34.92f)
                curveTo(109.71f, 70.39f, 94f, 67.43f, 84.51f, 59f)
                close()
                moveTo(171.51f, 59f)
                curveToRelative(-9.49f, 8.4f, -25.24f, 11.36f, -35f, 12.4f)
                curveTo(137.7f, 60.89f, 141f, 45.5f, 149f, 36.51f)
                arcToRelative(13.69f, 13.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, -4.5f)
                horizontalLineToRelative(0.49f)
                arcTo(16.62f, 16.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 49.08f)
                arcTo(13.69f, 13.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 171.49f, 59f)
                close()
            }
        }.build()

        return _GiftFill!!
    }

@Suppress("ObjectPropertyName")
private var _GiftFill: ImageVector? = null
