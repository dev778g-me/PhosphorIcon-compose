package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MetronomeFill: ImageVector
    get() {
        if (_MetronomeFill != null) {
            return _MetronomeFill!!
        }
        _MetronomeFill = ImageVector.Builder(
            name = "Filled.MetronomeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(187.14f, 114.84f)
                lineToRelative(26.78f, -29.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.84f, -10.76f)
                lineToRelative(-20.55f, 22.6f)
                lineToRelative(-17.2f, -54.07f)
                arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 149.08f, 32f)
                lineTo(106.91f, 32f)
                arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.66f, 43.15f)
                lineToRelative(-50.91f, 160f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 224f)
                lineTo(200f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.25f, -20.85f)
                close()
                moveTo(71.27f, 160f)
                lineTo(106.91f, 48f)
                horizontalLineToRelative(42.17f)
                lineToRelative(20f, 62.9f)
                lineTo(124.46f, 160f)
                close()
                moveTo(146.08f, 160f)
                lineTo(174.7f, 128.52f)
                lineTo(184.7f, 160f)
                close()
            }
        }.build()

        return _MetronomeFill!!
    }

@Suppress("ObjectPropertyName")
private var _MetronomeFill: ImageVector? = null
