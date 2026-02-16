package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DesktopTowerFill: ImageVector
    get() {
        if (_DesktopTowerFill != null) {
            return _DesktopTowerFill!!
        }
        _DesktopTowerFill = ImageVector.Builder(
            name = "Filled.DesktopTowerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 76f)
                lineTo(120f, 188f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(96f, 192f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(15.73f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.53f)
                lineTo(64.27f, 224f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 216.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 208f)
                lineTo(80f, 208f)
                lineTo(80f, 192f)
                lineTo(32f, 192f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 168f)
                lineTo(8f, 96f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 72f)
                horizontalLineToRelative(84f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 76f)
                close()
                moveTo(248f, 48f)
                lineTo(248f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(152f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(136f, 48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                horizontalLineToRelative(80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 48f)
                close()
                moveTo(203.9f, 181.57f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -10.34f, 10.33f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 203.9f, 181.57f)
                close()
                moveTo(224f, 103.47f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.73f, 96f)
                lineTo(168.27f, 96f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.25f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8.53f)
                horizontalLineToRelative(48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 103.47f)
                close()
                moveTo(224f, 71.47f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.73f, 64f)
                lineTo(168.27f, 64f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 71.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 80f)
                horizontalLineToRelative(48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 71.47f)
                close()
            }
        }.build()

        return _DesktopTowerFill!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopTowerFill: ImageVector? = null
