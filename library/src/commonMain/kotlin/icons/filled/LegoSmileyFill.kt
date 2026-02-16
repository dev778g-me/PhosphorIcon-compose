package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LegoSmileyFill: ImageVector
    get() {
        if (_LegoSmileyFill != null) {
            return _LegoSmileyFill!!
        }
        _LegoSmileyFill = ImageVector.Builder(
            name = "Filled.LegoSmileyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 48f)
                lineTo(168f, 48f)
                lineTo(168f, 32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(104f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 32f)
                lineTo(88f, 48f)
                lineTo(72f, 48f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(32.06f, 32.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 31f)
                verticalLineToRelative(17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(192f, 207f)
                arcToRelative(32.06f, 32.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -31f)
                lineTo(216f, 80f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 48f)
                close()
                moveTo(156f, 100f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 100f)
                close()
                moveTo(160.27f, 158.77f)
                arcToRelative(61f, 61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64.54f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.54f, -13.54f)
                arcToRelative(45f, 45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.46f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.54f, 13.54f)
                close()
                moveTo(104f, 32f)
                horizontalLineToRelative(48f)
                lineTo(152f, 48f)
                lineTo(104f, 48f)
                close()
                moveTo(100f, 100f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 100f)
                close()
                moveTo(176f, 224f)
                lineTo(80f, 224f)
                lineTo(80f, 208f)
                horizontalLineToRelative(96f)
                close()
            }
        }.build()

        return _LegoSmileyFill!!
    }

@Suppress("ObjectPropertyName")
private var _LegoSmileyFill: ImageVector? = null
