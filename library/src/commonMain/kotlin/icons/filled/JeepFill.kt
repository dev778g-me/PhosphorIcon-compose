package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.JeepFill: ImageVector
    get() {
        if (_JeepFill != null) {
            return _JeepFill!!
        }
        _JeepFill = ImageVector.Builder(
            name = "Filled.JeepFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 103.47f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.73f, 96f)
                lineTo(232f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.18f, -1.68f)
                lineTo(221.18f, 44.65f)
                arcTo(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 205.53f, 32f)
                lineTo(50.47f, 32f)
                arcTo(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.82f, 44.65f)
                lineTo(24.18f, 94.32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 96f)
                lineTo(16.27f, 96f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 103.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 112f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(64f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(80f, 184f)
                horizontalLineToRelative(20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(104f, 128.27f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.47f, -8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.53f, 8f)
                verticalLineToRelative(52f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(136f, 128.27f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.47f, -8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.53f, 8f)
                verticalLineToRelative(52f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 112f)
                horizontalLineToRelative(8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 103.47f)
                close()
                moveTo(68f, 144f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, 144f)
                close()
                moveTo(188f, 144f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188f, 144f)
                close()
                moveTo(40.18f, 96f)
                lineTo(50.47f, 48f)
                lineTo(205.53f, 48f)
                lineToRelative(10.29f, 48f)
                close()
            }
        }.build()

        return _JeepFill!!
    }

@Suppress("ObjectPropertyName")
private var _JeepFill: ImageVector? = null
