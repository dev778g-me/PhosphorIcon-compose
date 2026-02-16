package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MicrosoftExcelLogoFill: ImageVector
    get() {
        if (_MicrosoftExcelLogoFill != null) {
            return _MicrosoftExcelLogoFill!!
        }
        _MicrosoftExcelLogoFill = ImageVector.Builder(
            name = "Filled.MicrosoftExcelLogoFill",
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
                moveTo(72f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.15f, -13.12f)
                lineTo(81.59f, 128f)
                lineTo(65.85f, 109.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.3f, -10.24f)
                lineTo(92f, 115.5f)
                lineToRelative(13.85f, -16.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.3f, 10.24f)
                lineTo(102.41f, 128f)
                lineToRelative(15.74f, 18.88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.3f, 10.24f)
                lineTo(92f, 140.5f)
                lineTo(78.15f, 157.12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 160f)
                close()
                moveTo(128f, 216f)
                lineTo(72f, 216f)
                lineTo(72f, 192f)
                horizontalLineToRelative(56f)
                close()
                moveTo(128f, 64f)
                lineTo(72f, 64f)
                lineTo(72f, 40f)
                horizontalLineToRelative(56f)
                close()
                moveTo(200f, 216f)
                lineTo(144f, 216f)
                lineTo(144f, 192f)
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
                lineTo(144f, 40f)
                horizontalLineToRelative(56f)
                close()
            }
        }.build()

        return _MicrosoftExcelLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftExcelLogoFill: ImageVector? = null
