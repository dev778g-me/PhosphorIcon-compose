package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MoneyWavyFill: ImageVector
    get() {
        if (_MoneyWavyFill != null) {
            return _MoneyWavyFill!!
        }
        _MoneyWavyFill = ImageVector.Builder(
            name = "Filled.MoneyWavyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(244.24f, 60f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.75f, -0.4f)
                curveToRelative(-42.93f, 21f, -73.59f, 11.16f, -106f, 0.78f)
                curveTo(96.4f, 49.53f, 61.2f, 38.28f, 12.49f, 62.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 69.24f)
                lineTo(8f, 189.17f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.51f, 7.19f)
                curveToRelative(42.93f, -21f, 73.59f, -11.16f, 106.05f, -0.78f)
                curveToRelative(19.24f, 6.15f, 38.84f, 12.42f, 61f, 12.42f)
                curveToRelative(17.09f, 0f, 35.73f, -3.72f, 56.91f, -14.06f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.49f, -7.18f)
                lineTo(247.96f, 66.83f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 244.24f, 60f)
                close()
                moveTo(48f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(32f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(128f, 160f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 160f)
                close()
                moveTo(224f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(208f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _MoneyWavyFill!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyWavyFill: ImageVector? = null
