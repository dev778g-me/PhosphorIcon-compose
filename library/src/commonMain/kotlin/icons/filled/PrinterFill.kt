package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PrinterFill: ImageVector
    get() {
        if (_PrinterFill != null) {
            return _PrinterFill!!
        }
        _PrinterFill = ImageVector.Builder(
            name = "Filled.PrinterFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 96f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(200f, 184f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(64f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(56f, 184f)
                lineTo(24f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(16f, 96f)
                curveToRelative(0f, -13.23f, 11.36f, -24f, 25.33f, -24f)
                lineTo(56f, 72f)
                lineTo(56f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                lineTo(192f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                lineTo(200f, 72f)
                horizontalLineToRelative(14.67f)
                curveTo(228.64f, 72f, 240f, 82.77f, 240f, 96f)
                close()
                moveTo(72f, 72f)
                lineTo(184f, 72f)
                lineTo(184f, 48f)
                lineTo(72f, 48f)
                close()
                moveTo(184f, 160f)
                lineTo(72f, 160f)
                verticalLineToRelative(48f)
                lineTo(184f, 208f)
                close()
                moveTo(200f, 116f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 116f)
                close()
            }
        }.build()

        return _PrinterFill!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterFill: ImageVector? = null
