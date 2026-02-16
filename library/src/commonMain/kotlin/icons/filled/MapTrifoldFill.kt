package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MapTrifoldFill: ImageVector
    get() {
        if (_MapTrifoldFill != null) {
            return _MapTrifoldFill!!
        }
        _MapTrifoldFill = ImageVector.Builder(
            name = "Filled.MapTrifoldFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(228.92f, 49.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.86f, -1.45f)
                lineTo(160.93f, 63.52f)
                lineTo(99.58f, 32.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.52f, -0.6f)
                lineToRelative(-64f, 16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                lineTo(24f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.94f, 7.76f)
                lineToRelative(61.13f, -15.28f)
                lineToRelative(61.35f, 30.68f)
                arcTo(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, -0.24f)
                lineToRelative(64f, -16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 200f)
                lineTo(232f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228.92f, 49.69f)
                close()
                moveTo(96f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.94f, 0.24f)
                lineTo(40f, 189.75f)
                lineTo(40f, 62.25f)
                lineTo(95.07f, 48.48f)
                lineToRelative(0.93f, 0.46f)
                close()
                moveTo(216f, 193.75f)
                lineTo(160.93f, 207.52f)
                lineTo(160f, 207.06f)
                lineTo(160f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, -0.23f)
                lineTo(216f, 66.25f)
                close()
            }
        }.build()

        return _MapTrifoldFill!!
    }

@Suppress("ObjectPropertyName")
private var _MapTrifoldFill: ImageVector? = null
