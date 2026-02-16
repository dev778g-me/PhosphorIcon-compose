package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BandaidsFill: ImageVector
    get() {
        if (_BandaidsFill != null) {
            return _BandaidsFill!!
        }
        _BandaidsFill = ImageVector.Builder(
            name = "Filled.BandaidsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 128f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(184.57f, 128f)
                lineToRelative(27.71f, -27.72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -56.56f, -56.56f)
                lineTo(128f, 71.43f)
                lineTo(100.28f, 43.72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -56.56f, 56.56f)
                lineTo(71.43f, 128f)
                lineTo(43.72f, 155.72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 56.56f, 56.56f)
                lineTo(128f, 184.57f)
                lineToRelative(27.72f, 27.71f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 56.56f, -56.56f)
                close()
                moveTo(128f, 94.06f)
                lineTo(161.94f, 128f)
                lineTo(128f, 161.94f)
                lineTo(94.06f, 128f)
                close()
                moveTo(167f, 55.06f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 201f, 89f)
                lineToRelative(-27.72f, 27.72f)
                lineTo(139.31f, 82.75f)
                close()
                moveTo(89f, 201f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 55f, 167f)
                lineToRelative(27.72f, -27.72f)
                lineToRelative(33.94f, 33.94f)
                close()
            }
        }.build()

        return _BandaidsFill!!
    }

@Suppress("ObjectPropertyName")
private var _BandaidsFill: ImageVector? = null
