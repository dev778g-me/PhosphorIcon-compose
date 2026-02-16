package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CursorClickFill: ImageVector
    get() {
        if (_CursorClickFill != null) {
            return _CursorClickFill!!
        }
        _CursorClickFill = ImageVector.Builder(
            name = "Filled.CursorClickFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(220.49f, 190.83f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 17f)
                lineTo(207.8f, 220.49f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17f, 0f)
                lineToRelative(-56.56f, -56.57f)
                lineTo(115f, 214.09f)
                curveToRelative(0f, 0.1f, -0.08f, 0.21f, -0.13f, 0.32f)
                arcToRelative(15.83f, 15.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.6f, 9.59f)
                lineToRelative(-0.79f, 0f)
                arcToRelative(15.83f, 15.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.41f, -11f)
                lineTo(32.8f, 52.92f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52.92f, 32.8f)
                lineTo(213f, 85.07f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 29.8f)
                lineToRelative(-0.32f, 0.13f)
                lineToRelative(-50.17f, 19.27f)
                close()
                moveTo(96f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(104f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 32f)
                close()
                moveTo(16f, 104f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(16f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                close()
                moveTo(124.42f, 39.16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.74f, -3.58f)
                lineToRelative(8f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.31f, -7.16f)
                lineToRelative(-8f, 16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 124.42f, 39.16f)
                close()
                moveTo(28.42f, 120.85f)
                lineTo(12.42f, 128.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, 14.31f)
                lineToRelative(16f, -8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.16f, -14.31f)
                close()
            }
        }.build()

        return _CursorClickFill!!
    }

@Suppress("ObjectPropertyName")
private var _CursorClickFill: ImageVector? = null
