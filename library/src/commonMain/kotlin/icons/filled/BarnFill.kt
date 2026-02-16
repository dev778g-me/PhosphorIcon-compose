package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BarnFill: ImageVector
    get() {
        if (_BarnFill != null) {
            return _BarnFill!!
        }
        _BarnFill = ImageVector.Builder(
            name = "Filled.BarnFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 192f)
                horizontalLineToRelative(-8f)
                lineTo(232f, 130.57f)
                lineToRelative(1.49f, 2.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, -9.3f)
                lineToRelative(-40f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -1.94f)
                lineTo(137f, 18.77f)
                lineToRelative(-0.1f, -0.07f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17.76f, 0f)
                lineToRelative(-0.1f, 0.07f)
                lineTo(51.45f, 65.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 1.94f)
                lineToRelative(-40f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 9.3f)
                lineTo(24f, 130.57f)
                lineTo(24f, 192f)
                lineTo(16f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(240f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(112f, 80f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 16f)
                lineTo(112f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -16f)
                close()
                moveTo(164.64f, 120f)
                lineTo(128f, 146.17f)
                lineTo(91.36f, 120f)
                close()
                moveTo(72f, 125.83f)
                lineTo(114.24f, 156f)
                lineTo(72f, 186.17f)
                close()
                moveTo(91.36f, 192f)
                lineTo(128f, 165.83f)
                lineTo(164.64f, 192f)
                close()
                moveTo(184f, 186.17f)
                lineTo(141.76f, 156f)
                lineTo(184f, 125.83f)
                close()
            }
        }.build()

        return _BarnFill!!
    }

@Suppress("ObjectPropertyName")
private var _BarnFill: ImageVector? = null
