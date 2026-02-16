package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TableFill: ImageVector
    get() {
        if (_TableFill != null) {
            return _TableFill!!
        }
        _TableFill = ImageVector.Builder(
            name = "Filled.TableFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 48f)
                lineTo(32f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(24f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 48f)
                close()
                moveTo(40f, 112f)
                lineTo(80f, 112f)
                verticalLineToRelative(32f)
                lineTo(40f, 144f)
                close()
                moveTo(96f, 112f)
                lineTo(216f, 112f)
                verticalLineToRelative(32f)
                lineTo(96f, 144f)
                close()
                moveTo(40f, 160f)
                lineTo(80f, 160f)
                verticalLineToRelative(32f)
                lineTo(40f, 192f)
                close()
                moveTo(216f, 192f)
                lineTo(96f, 192f)
                lineTo(96f, 160f)
                lineTo(216f, 160f)
                verticalLineToRelative(32f)
                close()
            }
        }.build()

        return _TableFill!!
    }

@Suppress("ObjectPropertyName")
private var _TableFill: ImageVector? = null
