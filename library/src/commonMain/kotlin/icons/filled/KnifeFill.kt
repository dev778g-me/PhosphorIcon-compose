package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.KnifeFill: ImageVector
    get() {
        if (_KnifeFill != null) {
            return _KnifeFill!!
        }
        _KnifeFill = ImageVector.Builder(
            name = "Filled.KnifeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(236f, 49f)
                arcToRelative(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -42.63f, -17.66f)
                lineTo(143.16f, 81.54f)
                lineTo(18.34f, 206.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.86f, 13.45f)
                arcTo(160.67f, 160.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 58.4f, 224f)
                curveToRelative(32.95f, 0f, 65.91f, -10.2f, 96.94f, -30.23f)
                curveToRelative(31.76f, -20.5f, 50.19f, -43.82f, 51f, -44.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, -10.59f)
                lineTo(181.31f, 114f)
                lineToRelative(47.38f, -47.39f)
                arcTo(24.84f, 24.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 236f, 49f)
                close()
                moveTo(146.23f, 180.6f)
                curveToRelative(-34.43f, 22.1f, -69.94f, 30.92f, -105.76f, 26.3f)
                lineTo(146f, 101.34f)
                lineToRelative(43.09f, 43.1f)
                arcTo(220.09f, 220.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 146.23f, 180.6f)
                close()
            }
        }.build()

        return _KnifeFill!!
    }

@Suppress("ObjectPropertyName")
private var _KnifeFill: ImageVector? = null
