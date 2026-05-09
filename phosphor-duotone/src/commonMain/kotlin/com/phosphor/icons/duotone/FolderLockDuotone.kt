package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.FolderLockDuotone: ImageVector
    get() {
        if (_FolderLockDuotone != null) {
            return _FolderLockDuotone!!
        }
        _FolderLockDuotone = ImageVector.Builder(
            name = "Duotone.FolderLockDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(152f, 168f)
                horizontalLineToRelative(72f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-72f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(32f, 80f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(92.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 2.34f)
                lineTo(128f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 80f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(92.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 2.34f)
                lineTo(128f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 168f)
                horizontalLineToRelative(72f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112.56f, 208f)
                horizontalLineTo(39.38f)
                arcTo(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 200.62f)
                verticalLineTo(80f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 168f)
                verticalLineTo(156f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                verticalLineToRelative(12f)
            }
        }.build()

        return _FolderLockDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FolderLockDuotone: ImageVector? = null
