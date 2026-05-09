package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GitlabLogoFill: ImageVector
    get() {
        if (_GitlabLogoFill != null) {
            return _GitlabLogoFill!!
        }
        _GitlabLogoFill = ImageVector.Builder(
            name = "Filled.GitlabLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230.15f, 117.1f)
                lineTo(210.25f, 41f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.79f, -1.11f)
                lineTo(169.78f, 88f)
                lineTo(86.22f, 88f)
                lineTo(68.54f, 39.87f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.75f, 41f)
                lineTo(25.85f, 117.1f)
                arcToRelative(57.19f, 57.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 61f)
                lineToRelative(73.27f, 51.76f)
                arcToRelative(11.91f, 11.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.74f, 0f)
                lineToRelative(73.27f, -51.76f)
                arcTo(57.19f, 57.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 230.15f, 117.1f)
                close()
                moveTo(40.68f, 124.1f)
                lineTo(114.13f, 176f)
                lineTo(93.41f, 190.65f)
                lineTo(57.09f, 165f)
                arcTo(41.06f, 41.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.68f, 124.11f)
                close()
                moveTo(128f, 215.1f)
                lineTo(107.27f, 200.45f)
                lineTo(128f, 185.8f)
                lineToRelative(20.73f, 14.64f)
                close()
                moveTo(198.91f, 165f)
                lineToRelative(-36.32f, 25.66f)
                lineTo(141.87f, 176f)
                lineToRelative(73.45f, -51.9f)
                arcTo(41.06f, 41.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 198.91f, 165f)
                close()
            }
        }.build()

        return _GitlabLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _GitlabLogoFill: ImageVector? = null
