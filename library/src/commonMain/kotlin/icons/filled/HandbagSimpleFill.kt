package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HandbagSimpleFill: ImageVector
    get() {
        if (_HandbagSimpleFill != null) {
            return _HandbagSimpleFill!!
        }
        _HandbagSimpleFill = ImageVector.Builder(
            name = "Filled.HandbagSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.89f, 198.12f)
                lineToRelative(-14.26f, -120f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -14.12f)
                horizontalLineTo(176f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 0f)
                horizontalLineTo(46.33f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 14.12f)
                lineToRelative(-14.26f, 120f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 210.6f)
                arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5.4f)
                horizontalLineTo(223.92f)
                arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 236f, 210.6f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.89f, 198.12f)
                close()
                moveTo(128f, 32f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                horizontalLineTo(96f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 32f)
                close()
            }
        }.build()

        return _HandbagSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandbagSimpleFill: ImageVector? = null
