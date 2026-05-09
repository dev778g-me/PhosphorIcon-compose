package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ReadCvLogoFill: ImageVector
    get() {
        if (_ReadCvLogoFill != null) {
            return _ReadCvLogoFill!!
        }
        _ReadCvLogoFill = ImageVector.Builder(
            name = "Filled.ReadCvLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(210.78f, 39.25f)
                lineToRelative(-130.25f, -23f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 62f, 29.23f)
                lineToRelative(-29.75f, 169f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18.53f)
                lineToRelative(130.25f, 23f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.54f, -13f)
                lineToRelative(29.75f, -169f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 210.78f, 39.25f)
                close()
                moveTo(135.5f, 131.56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.87f, 6.61f)
                arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, -0.12f)
                lineToRelative(-41.5f, -7.33f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 87.52f, 115f)
                lineTo(129f, 122.29f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 135.5f, 131.56f)
                close()
                moveTo(182.5f, 107.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.86f, 6.61f)
                arcToRelative(7.55f, 7.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -0.13f)
                lineToRelative(-83f, -14.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.79f, -15.76f)
                lineToRelative(83f, 14.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 182.53f, 107.38f)
                close()
                moveTo(188.05f, 75.86f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.87f, 6.61f)
                arcToRelative(8.36f, 8.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, -0.12f)
                lineToRelative(-83f, -14.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.78f, -15.75f)
                lineToRelative(83f, 14.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 188.08f, 75.86f)
                close()
            }
        }.build()

        return _ReadCvLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _ReadCvLogoFill: ImageVector? = null
