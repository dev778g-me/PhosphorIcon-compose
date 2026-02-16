package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HospitalFill: ImageVector
    get() {
        if (_HospitalFill != null) {
            return _HospitalFill!!
        }
        _HospitalFill = ImageVector.Builder(
            name = "Filled.HospitalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 208f)
                horizontalLineToRelative(-8f)
                lineTo(240f, 128f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(168f, 112f)
                lineTo(168f, 48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(56f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 48f)
                lineTo(40f, 208f)
                lineTo(32f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(248f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(128f, 208f)
                lineTo(80f, 208f)
                lineTo(80f, 160f)
                horizontalLineToRelative(48f)
                close()
                moveTo(128f, 104f)
                lineTo(112f, 104f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(96f, 104f)
                lineTo(80f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(96f, 88f)
                lineTo(96f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(112f, 88f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(224f, 208f)
                lineTo(168f, 208f)
                lineTo(168f, 128f)
                horizontalLineToRelative(56f)
                close()
            }
        }.build()

        return _HospitalFill!!
    }

@Suppress("ObjectPropertyName")
private var _HospitalFill: ImageVector? = null
