package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GitlabLogoSimpleFill: ImageVector
    get() {
        if (_GitlabLogoSimpleFill != null) {
            return _GitlabLogoSimpleFill!!
        }
        _GitlabLogoSimpleFill = ImageVector.Builder(
            name = "Filled.GitlabLogoSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208.14f, 178.06f)
                lineToRelative(-73.27f, 51.76f)
                arcToRelative(11.91f, 11.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.74f, 0f)
                lineTo(47.86f, 178.06f)
                arcToRelative(57.19f, 57.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22f, -61f)
                lineTo(45.75f, 41f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.79f, -1.11f)
                lineTo(86.22f, 88f)
                horizontalLineToRelative(83.56f)
                lineToRelative(17.68f, -48.13f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 210.25f, 41f)
                lineToRelative(19.9f, 76.12f)
                arcTo(57.19f, 57.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208.14f, 178.06f)
                close()
            }
        }.build()

        return _GitlabLogoSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _GitlabLogoSimpleFill: ImageVector? = null
