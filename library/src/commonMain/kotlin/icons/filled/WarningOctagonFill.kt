package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WarningOctagonFill: ImageVector
    get() {
        if (_WarningOctagonFill != null) {
            return _WarningOctagonFill!!
        }
        _WarningOctagonFill = ImageVector.Builder(
            name = "Filled.WarningOctagonFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.31f, 80.23f)
                lineTo(175.77f, 28.69f)
                arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164.45f, 24f)
                lineTo(91.55f, 24f)
                arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 4.69f)
                lineTo(28.69f, 80.23f)
                arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.69f, 11.32f)
                lineToRelative(51.54f, 51.54f)
                arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.55f, 232f)
                horizontalLineToRelative(72.9f)
                arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -4.69f)
                lineToRelative(51.54f, -51.54f)
                arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 164.45f)
                lineTo(232f, 91.55f)
                arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.31f, 80.23f)
                close()
                moveTo(120f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(128f, 184f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 184f)
                close()
            }
        }.build()

        return _WarningOctagonFill!!
    }

@Suppress("ObjectPropertyName")
private var _WarningOctagonFill: ImageVector? = null
