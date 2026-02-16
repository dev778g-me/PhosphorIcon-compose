package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TrayFill: ImageVector
    get() {
        if (_TrayFill != null) {
            return _TrayFill!!
        }
        _TrayFill = ImageVector.Builder(
            name = "Filled.TrayFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                lineTo(48f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(208f, 208f)
                lineTo(48f, 208f)
                lineTo(48f, 168f)
                lineTo(76.69f, 168f)
                lineTo(96f, 187.32f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 107.31f, 192f)
                horizontalLineToRelative(41.38f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 187.31f)
                lineTo(179.31f, 168f)
                lineTo(208f, 168f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()

        return _TrayFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrayFill: ImageVector? = null
