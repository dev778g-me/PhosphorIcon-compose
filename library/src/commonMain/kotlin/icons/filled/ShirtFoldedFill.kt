package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ShirtFoldedFill: ImageVector
    get() {
        if (_ShirtFoldedFill != null) {
            return _ShirtFoldedFill!!
        }
        _ShirtFoldedFill = ImageVector.Builder(
            name = "Filled.ShirtFoldedFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(201f, 40f)
                lineTo(179.35f, 40f)
                lineTo(165.66f, 26.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 24f)
                lineTo(96f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 2.34f)
                lineTo(76.65f, 40f)
                lineTo(55f, 40f)
                arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 55f)
                lineTo(40f, 209f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15f)
                horizontalLineToRelative(61f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(120f, 104.27f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 127.47f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.53f, 8f)
                lineTo(136f, 220f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(61f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, -15f)
                lineTo(216f, 55f)
                arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 201f, 40f)
                close()
                moveTo(86.54f, 107.08f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 104f)
                lineTo(80f, 59.31f)
                lineTo(95.24f, 44.07f)
                lineToRelative(23.47f, 35.21f)
                close()
                moveTo(128f, 80f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(0f)
                close()
                moveTo(176f, 104f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.3f, 3.63f)
                arcToRelative(3.93f, 3.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.21f, -0.51f)
                lineToRelative(-32.2f, -27.82f)
                lineToRelative(23.47f, -35.21f)
                lineTo(176f, 59.31f)
                close()
            }
        }.build()

        return _ShirtFoldedFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShirtFoldedFill: ImageVector? = null
