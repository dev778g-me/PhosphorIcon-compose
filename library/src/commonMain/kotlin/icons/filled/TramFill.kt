package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TramFill: ImageVector
    get() {
        if (_TramFill != null) {
            return _TramFill!!
        }
        _TramFill = ImageVector.Builder(
            name = "Filled.TramFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 48f)
                lineTo(136f, 48f)
                lineTo(136f, 24f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(88f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(32f)
                lineTo(120f, 48f)
                lineTo(72f, 48f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 80f)
                lineTo(40f, 184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                horizontalLineToRelative(8f)
                lineTo(65.6f, 235.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.8f, 9.6f)
                lineTo(100f, 216f)
                horizontalLineToRelative(56f)
                lineToRelative(21.6f, 28.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.8f, -9.6f)
                lineTo(176f, 216f)
                horizontalLineToRelative(8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                lineTo(216f, 80f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 48f)
                close()
                moveTo(184f, 200f)
                lineTo(72f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(56f, 128f)
                lineTo(200f, 128f)
                verticalLineToRelative(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 200f)
                close()
                moveTo(96f, 172f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 172f)
                close()
                moveTo(184f, 172f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 172f)
                close()
            }
        }.build()

        return _TramFill!!
    }

@Suppress("ObjectPropertyName")
private var _TramFill: ImageVector? = null
