package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.GoogleDriveLogo: ImageVector
    get() {
        if (_GoogleDriveLogo != null) {
            return _GoogleDriveLogo!!
        }
        _GoogleDriveLogo = ImageVector.Builder(
            name = "Regular.GoogleDriveLogo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(93.65f, 35.76f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100.43f, 32f)
                horizontalLineToRelative(55.14f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.78f, 3.76f)
                lineToRelative(68.43f, 112.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, 8.21f)
                lineTo(203.62f, 204f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.94f, 4f)
                horizontalLineTo(59.32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.94f, -4f)
                lineTo(25.05f, 156.15f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, -8.21f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(55.12f, 206.8f)
                lineTo(159.41f, 32.98f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200.88f, 206.8f)
                lineTo(96.59f, 32.98f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 152f)
                lineTo(232f, 152f)
            }
        }.build()

        return _GoogleDriveLogo!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleDriveLogo: ImageVector? = null
