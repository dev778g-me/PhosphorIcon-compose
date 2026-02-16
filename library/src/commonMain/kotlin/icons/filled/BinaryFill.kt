package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BinaryFill: ImageVector
    get() {
        if (_BinaryFill != null) {
            return _BinaryFill!!
        }
        _BinaryFill = ImageVector.Builder(
            name = "Filled.BinaryFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 168f)
                curveToRelative(0f, 4.75f, -1.11f, 9.16f, -3.05f, 12.11f)
                arcTo(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 158f, 184f)
                curveToRelative(-9.72f, 0f, -10f, -14.36f, -10f, -16f)
                curveToRelative(0f, -4.74f, 1.11f, -9.16f, 3.05f, -12.11f)
                arcTo(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 158f, 152f)
                curveTo(167.72f, 152f, 168f, 166.36f, 168f, 168f)
                close()
                moveTo(224f, 48f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(140.84f, 75.58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.74f, 3.58f)
                lineTo(156f, 76.94f)
                lineTo(156f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(172f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.58f, -7.16f)
                lineToRelative(-16f, 8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140.84f, 75.58f)
                close()
                moveTo(112f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.58f, -7.16f)
                lineToRelative(-16f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, 14.32f)
                lineTo(96f, 156.94f)
                lineTo(96f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                close()
                moveTo(128f, 88f)
                curveToRelative(0f, -18.84f, -10.69f, -32f, -26f, -32f)
                reflectiveCurveTo(76f, 69.16f, 76f, 88f)
                reflectiveCurveToRelative(10.69f, 32f, 26f, 32f)
                reflectiveCurveTo(128f, 106.84f, 128f, 88f)
                close()
                moveTo(184f, 168f)
                curveToRelative(0f, -18.84f, -10.69f, -32f, -26f, -32f)
                reflectiveCurveToRelative(-26f, 13.16f, -26f, 32f)
                reflectiveCurveToRelative(10.69f, 32f, 26f, 32f)
                reflectiveCurveTo(184f, 186.84f, 184f, 168f)
                close()
                moveTo(102f, 72f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, 3.89f)
                curveToRelative(-1.94f, 3f, -3f, 7.37f, -3f, 12.11f)
                curveToRelative(0f, 1.64f, 0.28f, 16f, 10f, 16f)
                arcToRelative(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -3.89f)
                curveToRelative(1.94f, -3f, 3f, -7.36f, 3f, -12.11f)
                curveTo(112f, 86.36f, 111.72f, 72f, 102f, 72f)
                close()
            }
        }.build()

        return _BinaryFill!!
    }

@Suppress("ObjectPropertyName")
private var _BinaryFill: ImageVector? = null
