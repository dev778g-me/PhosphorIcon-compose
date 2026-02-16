package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TrayArrowUpFill: ImageVector
    get() {
        if (_TrayArrowUpFill != null) {
            return _TrayArrowUpFill!!
        }
        _TrayArrowUpFill = ImageVector.Builder(
            name = "Filled.TrayArrowUpFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                horizontalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(90.34f, 98.34f)
                lineToRelative(32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(136f, 91.31f)
                verticalLineTo(152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(91.31f)
                lineToRelative(-18.34f, 18.35f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 90.34f, 98.34f)
                close()
                moveTo(208f, 208f)
                horizontalLineTo(48f)
                verticalLineTo(168f)
                horizontalLineTo(76.69f)
                lineTo(96f, 187.31f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 107.31f, 192f)
                horizontalLineToRelative(41.38f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 187.31f)
                lineTo(179.31f, 168f)
                horizontalLineTo(208f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()

        return _TrayArrowUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrayArrowUpFill: ImageVector? = null
