package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.QrCodeFill: ImageVector
    get() {
        if (_QrCodeFill != null) {
            return _QrCodeFill!!
        }
        _QrCodeFill = ImageVector.Builder(
            name = "Filled.QrCodeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(56f, 40f)
                lineTo(104f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 56f)
                lineTo(120f, 104f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 120f)
                lineTo(56f, 120f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 104f)
                lineTo(40f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 40f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(56f, 136f)
                lineTo(104f, 136f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 152f)
                lineTo(120f, 200f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 216f)
                lineTo(56f, 216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 200f)
                lineTo(40f, 152f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 136f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 40f)
                lineTo(200f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 56f)
                lineTo(216f, 104f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 120f)
                lineTo(152f, 120f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 104f)
                lineTo(136f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 40f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(144f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 184f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 152f)
                horizontalLineTo(184f)
                verticalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(56f)
                horizontalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(168f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 184f)
                close()
            }
        }.build()

        return _QrCodeFill!!
    }

@Suppress("ObjectPropertyName")
private var _QrCodeFill: ImageVector? = null
