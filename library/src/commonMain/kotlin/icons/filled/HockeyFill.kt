package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HockeyFill: ImageVector
    get() {
        if (_HockeyFill != null) {
            return _HockeyFill!!
        }
        _HockeyFill = ImageVector.Builder(
            name = "Filled.HockeyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(149.9f, 122.82f)
                lineToRelative(68f, -80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.2f, 10.36f)
                lineToRelative(-68f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.2f, -10.36f)
                close()
                moveTo(240f, 168f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(171.7f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.19f, -5.64f)
                lineTo(25.9f, 53.18f)
                horizontalLineToRelative(0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 38.1f, 42.82f)
                lineTo(130.9f, 152f)
                lineTo(224f, 152f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 168f)
                close()
                moveTo(224f, 168f)
                lineTo(208f, 168f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(16f)
                close()
                moveTo(115.3f, 183.06f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.18f)
                lineTo(96.49f, 210.36f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84.3f, 216f)
                lineTo(32f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(16f, 168f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                lineTo(87.05f, 152f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 1.41f)
                close()
                moveTo(48f, 168f)
                lineTo(32f, 168f)
                verticalLineToRelative(32f)
                lineTo(48f, 200f)
                close()
            }
        }.build()

        return _HockeyFill!!
    }

@Suppress("ObjectPropertyName")
private var _HockeyFill: ImageVector? = null
