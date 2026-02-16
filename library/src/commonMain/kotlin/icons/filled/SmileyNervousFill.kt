package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SmileyNervousFill: ImageVector
    get() {
        if (_SmileyNervousFill != null) {
            return _SmileyNervousFill!!
        }
        _SmileyNervousFill = ImageVector.Builder(
            name = "Filled.SmileyNervousFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(164f, 96f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 96f)
                close()
                moveTo(92f, 96f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 96f)
                close()
                moveTo(176f, 176f)
                curveToRelative(-10f, 0f, -15.05f, -6.74f, -18.4f, -11.2f)
                curveToRelative(-3f, -4f, -3.92f, -4.8f, -5.6f, -4.8f)
                reflectiveCurveToRelative(-2.57f, 0.76f, -5.6f, 4.8f)
                curveTo(143.05f, 169.26f, 138f, 176f, 128f, 176f)
                reflectiveCurveToRelative(-15f, -6.74f, -18.4f, -11.2f)
                curveToRelative(-3f, -4f, -3.92f, -4.8f, -5.6f, -4.8f)
                reflectiveCurveToRelative(-2.57f, 0.76f, -5.6f, 4.8f)
                curveTo(95.05f, 169.26f, 90f, 176f, 80f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                curveToRelative(1.68f, 0f, 2.57f, -0.76f, 5.6f, -4.8f)
                curveTo(89f, 150.74f, 94f, 144f, 104f, 144f)
                reflectiveCurveToRelative(15f, 6.74f, 18.4f, 11.2f)
                curveToRelative(3f, 4f, 3.92f, 4.8f, 5.6f, 4.8f)
                reflectiveCurveToRelative(2.57f, -0.76f, 5.6f, -4.8f)
                curveTo(137f, 150.74f, 142f, 144f, 152f, 144f)
                reflectiveCurveToRelative(15.05f, 6.74f, 18.4f, 11.2f)
                curveToRelative(3f, 4f, 3.92f, 4.8f, 5.6f, 4.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _SmileyNervousFill!!
    }

@Suppress("ObjectPropertyName")
private var _SmileyNervousFill: ImageVector? = null
