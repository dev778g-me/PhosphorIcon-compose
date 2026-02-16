package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PrescriptionFill: ImageVector
    get() {
        if (_PrescriptionFill != null) {
            return _PrescriptionFill!!
        }
        _PrescriptionFill = ImageVector.Builder(
            name = "Filled.PrescriptionFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 120f)
                lineTo(96f, 120f)
                lineTo(96f, 72f)
                horizontalLineToRelative(32f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
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
                moveTo(189.66f, 186.34f)
                lineTo(175.31f, 172f)
                lineToRelative(14.35f, -14.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(164f, 160.69f)
                lineToRelative(-26f, -26f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 56f)
                lineTo(88f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(80f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(96f, 136f)
                horizontalLineToRelative(20.69f)
                lineToRelative(36f, 36f)
                lineToRelative(-14.35f, 14.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineTo(164f, 183.31f)
                lineToRelative(14.34f, 14.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
            }
        }.build()

        return _PrescriptionFill!!
    }

@Suppress("ObjectPropertyName")
private var _PrescriptionFill: ImageVector? = null
