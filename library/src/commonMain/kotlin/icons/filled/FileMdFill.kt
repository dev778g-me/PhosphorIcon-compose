package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FileMdFill: ImageVector
    get() {
        if (_FileMdFill != null) {
            return _FileMdFill!!
        }
        _FileMdFill = ImageVector.Builder(
            name = "Filled.FileMdFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.66f, 82.34f)
                lineToRelative(-56f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineToRelative(76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(196f, 120f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                lineTo(200f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.19f, 7.91f)
                arcToRelative(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.81f, -8.16f)
                lineTo(216f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 213.66f, 82.34f)
                close()
                moveTo(152f, 88f)
                lineTo(152f, 44f)
                lineToRelative(44f, 44f)
                close()
                moveTo(144f, 144f)
                lineTo(128f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(15.32f)
                curveToRelative(19.66f, 0f, 36.21f, -15.48f, 36.67f, -35.13f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 144f)
                close()
                moveTo(143.51f, 200f)
                lineTo(136f, 200f)
                lineTo(136f, 160f)
                horizontalLineToRelative(8f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20.77f)
                curveTo(163.58f, 191.59f, 154.34f, 200f, 143.51f, 200f)
                close()
                moveTo(104f, 152f)
                verticalLineToRelative(55.73f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96.53f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 208f)
                lineTo(88f, 177.38f)
                lineToRelative(-13.32f, 19f)
                arcToRelative(8.3f, 8.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.2f, 3.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -3f)
                lineTo(48f, 177.38f)
                verticalLineToRelative(30.35f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.53f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 208f)
                lineTo(32f, 152.31f)
                arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.56f, -7.53f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2.63f)
                lineTo(68f, 178.05f)
                lineToRelative(21.27f, -30.39f)
                arcToRelative(8.28f, 8.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.06f, -3.55f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 152f)
                close()
            }
        }.build()

        return _FileMdFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileMdFill: ImageVector? = null
