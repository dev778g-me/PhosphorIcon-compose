package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SuitcaseFill: ImageVector
    get() {
        if (_SuitcaseFill != null) {
            return _SuitcaseFill!!
        }
        _SuitcaseFill = ImageVector.Builder(
            name = "Filled.SuitcaseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 56f)
                lineTo(176f, 56f)
                lineTo(176f, 48f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                lineTo(104f, 24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 48f)
                verticalLineToRelative(8f)
                lineTo(40f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 72f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 56f)
                close()
                moveTo(96f, 72f)
                horizontalLineToRelative(64f)
                lineTo(160f, 200f)
                lineTo(96f, 200f)
                close()
                moveTo(96f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(8f)
                lineTo(96f, 56f)
                close()
            }
        }.build()

        return _SuitcaseFill!!
    }

@Suppress("ObjectPropertyName")
private var _SuitcaseFill: ImageVector? = null
