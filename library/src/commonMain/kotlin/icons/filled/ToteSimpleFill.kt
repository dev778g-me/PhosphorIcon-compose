package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ToteSimpleFill: ImageVector
    get() {
        if (_ToteSimpleFill != null) {
            return _ToteSimpleFill!!
        }
        _ToteSimpleFill = ImageVector.Builder(
            name = "Filled.ToteSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(236f, 69.4f)
                arcTo(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 223.92f, 64f)
                horizontalLineTo(176f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 0f)
                horizontalLineTo(32.08f)
                arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 5.4f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.92f, 12.48f)
                lineToRelative(14.26f, 120f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 14.12f)
                horizontalLineTo(209.67f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -14.12f)
                lineToRelative(14.26f, -120f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 236f, 69.4f)
                close()
                moveTo(128f, 32f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                horizontalLineTo(96f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 32f)
                close()
            }
        }.build()

        return _ToteSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ToteSimpleFill: ImageVector? = null
