package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MicrosoftWordLogoFill: ImageVector
    get() {
        if (_MicrosoftWordLogoFill != null) {
            return _MicrosoftWordLogoFill!!
        }
        _MicrosoftWordLogoFill = ImageVector.Builder(
            name = "Filled.MicrosoftWordLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                lineTo(72f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                lineTo(56f, 64f)
                lineTo(40f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(56f, 192f)
                verticalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(200f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(68.24f, 153.94f)
                lineToRelative(-12f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.52f, -3.88f)
                lineToRelative(6.76f, 27f)
                lineToRelative(6.32f, -12.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.32f, 0f)
                lineToRelative(6.32f, 12.66f)
                lineToRelative(6.76f, -27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.52f, 3.88f)
                lineToRelative(-12f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.89f, 6f)
                arcToRelative(8.46f, 8.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.87f, 0.05f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, -4.42f)
                lineTo(92f, 137.89f)
                lineToRelative(-8.84f, 17.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.92f, -1.64f)
                close()
                moveTo(200f, 216f)
                lineTo(72f, 216f)
                lineTo(72f, 192f)
                horizontalLineToRelative(72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(40f)
                close()
                moveTo(200f, 152f)
                lineTo(160f, 152f)
                lineTo(160f, 104f)
                horizontalLineToRelative(40f)
                close()
                moveTo(200f, 88f)
                lineTo(160f, 88f)
                lineTo(160f, 80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(72f, 64f)
                lineTo(72f, 40f)
                lineTo(200f, 40f)
                close()
            }
        }.build()

        return _MicrosoftWordLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftWordLogoFill: ImageVector? = null
